(ns com.google.cloud.testing.BaseEmulatorHelper$GcloudEmulatorRunner
  "Utility class to start and run an emulator from the Google Cloud SDK."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.testing BaseEmulatorHelper$GcloudEmulatorRunner]))

(defn ->gcloud-emulator-runner
  "Constructor.

  command-text - `java.util.List`
  version-prefix - `java.lang.String`
  min-version - `java.lang.String`"
  (^BaseEmulatorHelper$GcloudEmulatorRunner [^java.util.List command-text ^java.lang.String version-prefix ^java.lang.String min-version]
    (new BaseEmulatorHelper$GcloudEmulatorRunner command-text version-prefix min-version)))

(defn available?
  "Description copied from interface: BaseEmulatorHelper.EmulatorRunner

  returns: `boolean`"
  (^Boolean [^BaseEmulatorHelper$GcloudEmulatorRunner this]
    (-> this (.isAvailable))))

(defn start
  "Description copied from interface: BaseEmulatorHelper.EmulatorRunner

  throws: java.io.IOException"
  ([^BaseEmulatorHelper$GcloudEmulatorRunner this]
    (-> this (.start))))

(defn wait-for
  "Description copied from interface: BaseEmulatorHelper.EmulatorRunner

  timeout - `org.threeten.bp.Duration`

  returns: `int`

  throws: java.lang.InterruptedException"
  (^Integer [^BaseEmulatorHelper$GcloudEmulatorRunner this ^org.threeten.bp.Duration timeout]
    (-> this (.waitFor timeout))))

(defn get-process
  "Description copied from interface: BaseEmulatorHelper.EmulatorRunner

  returns: `java.lang.Process`"
  (^java.lang.Process [^BaseEmulatorHelper$GcloudEmulatorRunner this]
    (-> this (.getProcess))))

