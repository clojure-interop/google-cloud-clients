(ns com.google.cloud.datastore.testing.LocalDatastoreHelper
  "Utility to start and stop local Google Cloud Datastore emulators.

  This class is unstable."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore.testing LocalDatastoreHelper]))

(defn *create
  "Creates a local Datastore helper with the specified settings for project ID and consistency.

  consistency - the fraction of Datastore writes that are immediately visible to global queries, with 0.0 meaning no writes are immediately visible and 1.0 meaning all writes are immediately visible. Note that setting this to 1.0 may mask incorrect assumptions about the consistency of non-ancestor queries; non-ancestor queries are eventually consistent. - `double`
  port - the port to be used to start the emulator service. Note that setting this to 0 the emulator will search for a free random port. - `int`

  returns: `com.google.cloud.datastore.testing.LocalDatastoreHelper`"
  (^com.google.cloud.datastore.testing.LocalDatastoreHelper [^Double consistency ^Integer port]
    (LocalDatastoreHelper/create consistency port))
  (^com.google.cloud.datastore.testing.LocalDatastoreHelper [^Double consistency]
    (LocalDatastoreHelper/create consistency))
  (^com.google.cloud.datastore.testing.LocalDatastoreHelper []
    (LocalDatastoreHelper/create )))

(defn get-options
  "Returns a DatastoreOptions instance that sets the host to use the Datastore emulator on
   localhost. The default namespace is set to namespace.

  namespace - `java.lang.String`

  returns: `com.google.cloud.datastore.DatastoreOptions`"
  (^com.google.cloud.datastore.DatastoreOptions [^LocalDatastoreHelper this ^java.lang.String namespace]
    (-> this (.getOptions namespace)))
  (^com.google.cloud.datastore.DatastoreOptions [^LocalDatastoreHelper this]
    (-> this (.getOptions))))

(defn get-consistency
  "Returns the consistency setting for the local Datastore emulator.

  returns: `double`"
  (^Double [^LocalDatastoreHelper this]
    (-> this (.getConsistency))))

(defn start
  "Starts the local Datastore emulator through gcloud, downloads and caches the zip file
   if user does not have gcloud or a compatible emulator version installed.

   Currently the emulator does not persist any state across runs.

  throws: java.io.IOException"
  ([^LocalDatastoreHelper this]
    (-> this (.start))))

(defn reset
  "Resets the internal state of the Datastore emulator.

   When running tests, one might reset() before each test, so earlier tests would not
   affect later ones.

  throws: java.io.IOException"
  ([^LocalDatastoreHelper this]
    (-> this (.reset))))

(defn stop
  "Stops the Datastore emulator.

   It is important to stop the emulator. Since the emulator runs in its own process, not
   stopping it might cause it to become orphan.

   It is not required to call reset() before stop.

  timeout - The duration to wait for the emulator process to stop. It is recommended to set this value high to ensure proper shutdown, like 5 seconds or more. - `org.threeten.bp.Duration`

  throws: java.io.IOException"
  ([^LocalDatastoreHelper this ^org.threeten.bp.Duration timeout]
    (-> this (.stop timeout)))
  ([^LocalDatastoreHelper this]
    (-> this (.stop))))

