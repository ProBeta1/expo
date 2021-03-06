package expo.modules.developmentclient.launcher

import com.facebook.react.ReactActivity
import com.facebook.react.ReactActivityDelegate
import expo.modules.developmentclient.DevelopmentClientController

class DevelopmentClientActivity : ReactActivity() {
  override fun getMainComponentName() = "main"

  override fun createReactActivityDelegate(): ReactActivityDelegate {
    return object : ReactActivityDelegate(this, mainComponentName) {
      override fun getReactNativeHost() = DevelopmentClientController.instance.devClientHost
    }
  }
}
