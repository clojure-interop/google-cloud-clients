(ns com.google.cloud.datastore.testing.RemoteDatastoreHelper
  "Utility to create a remote datastore configuration for testing. Datastore options can be obtained
  via the getOptions() method. Returned options use a randomly generated namespace (DatastoreOptions.getNamespace()) that can be used to run the tests. Once the tests are run, all
  entities in the namespace can be deleted using deleteNamespace(). Returned options also
  have custom ServiceOptions.getRetrySettings(): RetrySettings.getMaxAttempts()
  is 10, RetrySettings.getMaxRetryDelay() is 30000, RetrySettings.getTotalTimeout() is 120000 and RetrySettings.getInitialRetryDelay() is 250. HttpTransportOptions.getConnectTimeout() and HttpTransportOptions.getReadTimeout() are
  both both set to 60000.

  Internal testing use only"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore.testing RemoteDatastoreHelper]))

(defn *create
  "Creates a RemoteStorageHelper object.

  returns: `com.google.cloud.datastore.testing.RemoteDatastoreHelper`"
  (^com.google.cloud.datastore.testing.RemoteDatastoreHelper []
    (RemoteDatastoreHelper/create )))

(defn get-options
  "Returns a DatastoreOptions object to be used for testing. The options are associated to
   a randomly generated namespace.

  returns: `com.google.cloud.datastore.DatastoreOptions`"
  (^com.google.cloud.datastore.DatastoreOptions [^RemoteDatastoreHelper this]
    (-> this (.getOptions))))

(defn delete-namespace
  "Deletes all entities in the namespace associated with this RemoteDatastoreHelper."
  ([^RemoteDatastoreHelper this]
    (-> this (.deleteNamespace))))

