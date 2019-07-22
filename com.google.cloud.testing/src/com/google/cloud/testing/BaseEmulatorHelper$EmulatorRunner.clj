(ns com.google.cloud.testing.BaseEmulatorHelper$EmulatorRunner
  "Utility interface to start and run an emulator."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.testing BaseEmulatorHelper$EmulatorRunner]))

(defn available?
  "Returns true if the emulator associated to this runner is available and can be
   started.

  returns: `boolean`"
  (^Boolean [^BaseEmulatorHelper$EmulatorRunner this]
    (-> this (.isAvailable))))

(defn start
  "Starts the emulator associated to this runner.

  throws: java.io.IOException"
  ([^BaseEmulatorHelper$EmulatorRunner this]
    (-> this (.start))))

(defn wait-for
  "Wait for the emulator associated to this runner to terminate, returning the exit status.

  timeout - `org.threeten.bp.Duration`

  returns: `int`

  throws: java.lang.InterruptedException"
  (^Integer [^BaseEmulatorHelper$EmulatorRunner this ^org.threeten.bp.Duration timeout]
    (-> this (.waitFor timeout))))

(defn get-process
  "Returns the process associated to the emulator, if any.

  returns: `java.lang.Process`"
  (^java.lang.Process [^BaseEmulatorHelper$EmulatorRunner this]
    (-> this (.getProcess))))

