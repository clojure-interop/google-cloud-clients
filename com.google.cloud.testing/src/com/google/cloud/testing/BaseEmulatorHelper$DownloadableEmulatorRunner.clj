(ns com.google.cloud.testing.BaseEmulatorHelper$DownloadableEmulatorRunner
  "Utility class to start and run an emulator from a download URL."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.testing BaseEmulatorHelper$DownloadableEmulatorRunner]))

(defn ->downloadable-emulator-runner
  "Constructor.

  command-text - `java.util.List`
  download-url - `java.net.URL`
  md-5-check-sum - `java.lang.String`"
  (^BaseEmulatorHelper$DownloadableEmulatorRunner [^java.util.List command-text ^java.net.URL download-url ^java.lang.String md-5-check-sum]
    (new BaseEmulatorHelper$DownloadableEmulatorRunner command-text download-url md-5-check-sum)))

(defn available?
  "Description copied from interface: BaseEmulatorHelper.EmulatorRunner

  returns: `boolean`"
  (^Boolean [^BaseEmulatorHelper$DownloadableEmulatorRunner this]
    (-> this (.isAvailable))))

(defn start
  "Description copied from interface: BaseEmulatorHelper.EmulatorRunner

  throws: java.io.IOException"
  ([^BaseEmulatorHelper$DownloadableEmulatorRunner this]
    (-> this (.start))))

(defn wait-for
  "Description copied from interface: BaseEmulatorHelper.EmulatorRunner

  timeout - `org.threeten.bp.Duration`

  returns: `int`

  throws: java.lang.InterruptedException"
  (^Integer [^BaseEmulatorHelper$DownloadableEmulatorRunner this ^org.threeten.bp.Duration timeout]
    (-> this (.waitFor timeout))))

(defn get-process
  "Description copied from interface: BaseEmulatorHelper.EmulatorRunner

  returns: `java.lang.Process`"
  (^java.lang.Process [^BaseEmulatorHelper$DownloadableEmulatorRunner this]
    (-> this (.getProcess))))

