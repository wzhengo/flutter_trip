package devio.org.flutter_trip

import androidx.annotation.NonNull;
import com.wz.plugin.asr.AsrPlugin
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity : FlutterActivity() {
    override fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine) {
        GeneratedPluginRegistrant.registerWith(flutterEngine);
        val shimPluginRegistry = ShimPluginRegistry(flutterEngine)
        AsrPlugin.registerWith(shimPluginRegistry.registrarFor("org.devio.flutter.plugin.asr.AsrPlugin"))
    }
}
