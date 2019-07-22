(ns com.google.cloud.storage.contrib.nio.CloudStorageRetryHandler
  "Simple counter class to keep track of retry and reopen attempts when StorageExceptions are
  encountered. Handles sleeping between retry/reopen attempts, as well as throwing an exception
  when all retries/reopens are exhausted."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.contrib.nio CloudStorageRetryHandler]))

(defn ->cloud-storage-retry-handler
  "Constructor.

  Create a CloudStorageRetryHandler with the maximum retries and reopens set to different values.

  max-retries - maximum number of retries - `int`
  max-reopens - maximum number of reopens (overrides what's in the config) - `int`
  config - http codes we'll retry on, and exceptions we'll reopen on. - `com.google.cloud.storage.contrib.nio.CloudStorageConfiguration`"
  (^CloudStorageRetryHandler [^Integer max-retries ^Integer max-reopens ^com.google.cloud.storage.contrib.nio.CloudStorageConfiguration config]
    (new CloudStorageRetryHandler max-retries max-reopens config))
  (^CloudStorageRetryHandler [^Integer max-retries ^Integer max-reopens]
    (new CloudStorageRetryHandler max-retries max-reopens))
  (^CloudStorageRetryHandler [^Integer max-retries-and-reopens]
    (new CloudStorageRetryHandler max-retries-and-reopens)))

(defn retries
  "returns: number of retries we've performed - `int`"
  (^Integer [^CloudStorageRetryHandler this]
    (-> this (.retries))))

(defn reopens
  "returns: number of reopens we've performed - `int`"
  (^Integer [^CloudStorageRetryHandler this]
    (-> this (.reopens))))

(defn handle-storage-exception
  "Checks whether we should retry, reopen, or give up.

   In the latter case it throws an exception (this includes the scenario where we exhausted the
   retry count).

   Otherwise, it sleeps for a bit and returns whether we should reopen. The sleep time is
   dependent on the retry number.

  exs - caught StorageException - `com.google.cloud.storage.StorageException`

  returns: True if you need to reopen and then try again. False if you can just try again. - `boolean`

  throws: com.google.cloud.storage.StorageException - if the exception is not retryable, or if you ran out of retries."
  (^Boolean [^CloudStorageRetryHandler this ^com.google.cloud.storage.StorageException exs]
    (-> this (.handleStorageException exs))))

