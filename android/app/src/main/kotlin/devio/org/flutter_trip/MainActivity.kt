package devio.org.flutter_trip

import android.os.Bundle
import androidx.annotation.NonNull
import com.wz.plugin.asr.AsrPlugin
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry
import io.flutter.plugins.GeneratedPluginRegistrant
import org.devio.flutter.splashscreen.SplashScreen

class MainActivity : FlutterActivity() {
    override fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine) {
        GeneratedPluginRegistrant.registerWith(flutterEngine);
        val shimPluginRegistry = ShimPluginRegistry(flutterEngine)
        AsrPlugin.registerWith(shimPluginRegistry.registrarFor("com.wz.plugin.asr.AsrPlugin"))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        SplashScreen.show(this,true)
        super.onCreate(savedInstanceState)
    }
}
