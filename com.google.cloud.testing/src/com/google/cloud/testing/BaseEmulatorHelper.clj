(ns com.google.cloud.testing.BaseEmulatorHelper
  "Utility class to start and stop a local service which is used by unit testing."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.testing BaseEmulatorHelper]))

(defn get-port
  "Returns the port to which the local emulator is listening.

  returns: `int`"
  (^Integer [^BaseEmulatorHelper this]
    (-> this (.getPort))))

(defn get-project-id
  "Returns the project ID associated with the local emulator.

  returns: `java.lang.String`"
  (^java.lang.String [^BaseEmulatorHelper this]
    (-> this (.getProjectId))))

(defn get-options
  "Returns service options to access the local emulator.

  returns: `T`"
  ([^BaseEmulatorHelper this]
    (-> this (.getOptions))))

(defn start
  "Starts the local emulator.

  throws: java.io.IOException"
  ([^BaseEmulatorHelper this]
    (-> this (.start))))

(defn stop
  "Stops the local emulator.

  timeout - `org.threeten.bp.Duration`

  throws: java.io.IOException"
  ([^BaseEmulatorHelper this ^org.threeten.bp.Duration timeout]
    (-> this (.stop timeout))))

(defn reset
  "Resets the internal state of the emulator.

  throws: java.io.IOException"
  ([^BaseEmulatorHelper this]
    (-> this (.reset))))

