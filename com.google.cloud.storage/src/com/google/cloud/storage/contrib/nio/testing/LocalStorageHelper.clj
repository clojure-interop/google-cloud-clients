(ns com.google.cloud.storage.contrib.nio.testing.LocalStorageHelper
  "Utility to create an in-memory storage configuration for testing. Storage options can be obtained
  via the getOptions() method. Returned options will point to FakeStorageRpc.

  Note, the created in-memory storage configuration supports limited set of operations and is
  not thread-safe:


    Supported operations

          object create
          object get
          object delete
          list the contents of a bucket

    Unsupported operations

          bucket create
          bucket get
          bucket delete
          list all buckets
          generations
          file attributes
          patch
          continueRewrite
          createBatch
          checksums, etags
          IAM operations



  FakeStorageRpc.list(String, java.util.Map) lists all the objects that have been created
  rather than the objects in the provided bucket. Since this class does not support creating,
  listing and deleting buckets, the parameter bucket here is not actually used and on serves as a
  placeholder."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.contrib.nio.testing LocalStorageHelper]))

(defn *get-options
  "Returns a StorageOptions that use the static FakeStorageRpc instance, and resets it
   first so you start from a clean slate. That instance will throw if you pass it any option.

  returns: `com.google.cloud.storage.StorageOptions`"
  (^com.google.cloud.storage.StorageOptions []
    (LocalStorageHelper/getOptions )))

(defn *custom-options
  "Returns a StorageOptions that creates a new FakeStorageRpc instance with the given
   option.

  throw-if-options - `boolean`

  returns: `com.google.cloud.storage.StorageOptions`"
  (^com.google.cloud.storage.StorageOptions [^Boolean throw-if-options]
    (LocalStorageHelper/customOptions throw-if-options)))

