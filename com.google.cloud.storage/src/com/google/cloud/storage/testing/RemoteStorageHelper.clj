(ns com.google.cloud.storage.testing.RemoteStorageHelper
  "Utility to create a remote storage configuration for testing. Storage options can be obtained via
  the getOptions() ()} method. Returned options have custom ServiceOptions.getRetrySettings(): RetrySettings.getMaxAttempts() is 10, RetrySettings.getMaxRetryDelay() is 30000, RetrySettings.getTotalTimeout() is
  120000 and RetrySettings.getInitialRetryDelay() is 250. HttpTransportOptions.getConnectTimeout() and HttpTransportOptions.getReadTimeout() are
  both set to 60000."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.testing RemoteStorageHelper]))

(defn *clean-buckets
  "storage - `com.google.cloud.storage.Storage`
  older-than - `long`
  timeout-ms - `long`"
  ([^com.google.cloud.storage.Storage storage ^Long older-than ^Long timeout-ms]
    (RemoteStorageHelper/cleanBuckets storage older-than timeout-ms)))

(defn *force-delete
  "Deletes a bucket, even if non-empty. Objects in the bucket are listed and deleted until bucket
   deletion succeeds or timeout expires. To allow for the timeout, this method uses a
   separate thread to send the delete requests. Use forceDelete(Storage storage, String
   bucket) if spawning an additional thread is undesirable, such as in the App Engine production
   runtime.

  storage - the storage service to be used to issue requests - `com.google.cloud.storage.Storage`
  bucket - the bucket to be deleted - `java.lang.String`
  timeout - the maximum time to wait - `long`
  unit - the time unit of the timeout argument - `java.util.concurrent.TimeUnit`
  user-project - the project to bill for requester-pays buckets (or \"\") - `java.lang.String`

  returns: true if deletion succeeded, false if timeout expired - `java.lang.Boolean`

  throws: java.lang.InterruptedException - if the thread deleting the bucket is interrupted while waiting"
  (^java.lang.Boolean [^com.google.cloud.storage.Storage storage ^java.lang.String bucket ^Long timeout ^java.util.concurrent.TimeUnit unit ^java.lang.String user-project]
    (RemoteStorageHelper/forceDelete storage bucket timeout unit user-project))
  (^java.lang.Boolean [^com.google.cloud.storage.Storage storage ^java.lang.String bucket ^Long timeout ^java.util.concurrent.TimeUnit unit]
    (RemoteStorageHelper/forceDelete storage bucket timeout unit))
  ([^com.google.cloud.storage.Storage storage ^java.lang.String bucket]
    (RemoteStorageHelper/forceDelete storage bucket)))

(defn *generate-bucket-name
  "Returns a bucket name generated using a random UUID.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RemoteStorageHelper/generateBucketName )))

(defn *create
  "Creates a RemoteStorageHelper object for the given project id and JSON key input
   stream.

  project-id - id of the project to be used for running the tests - `java.lang.String`
  key-stream - input stream for a JSON key - `java.io.InputStream`

  returns: A RemoteStorageHelper object for the provided options - `com.google.cloud.storage.testing.RemoteStorageHelper`

  throws: com.google.cloud.storage.testing.RemoteStorageHelper$StorageHelperException - if keyStream is not a valid JSON key stream"
  (^com.google.cloud.storage.testing.RemoteStorageHelper [^java.lang.String project-id ^java.io.InputStream key-stream]
    (RemoteStorageHelper/create project-id key-stream))
  (^com.google.cloud.storage.testing.RemoteStorageHelper []
    (RemoteStorageHelper/create )))

(defn get-options
  "Returns a StorageOptions object to be used for testing.

  returns: `com.google.cloud.storage.StorageOptions`"
  (^com.google.cloud.storage.StorageOptions [^RemoteStorageHelper this]
    (-> this (.getOptions))))

