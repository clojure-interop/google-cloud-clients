(ns com.google.cloud.storage.StorageException
  "Storage service exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage StorageException]))

(defn ->storage-exception
  "Constructor.

  code - `int`
  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^StorageException [^Integer code ^java.lang.String message ^java.lang.Throwable cause]
    (new StorageException code message cause))
  (^StorageException [^Integer code ^java.lang.String message]
    (new StorageException code message))
  (^StorageException [^java.io.IOException exception]
    (new StorageException exception)))

(defn *translate-and-throw
  "Translate RetryHelperException to the StorageException that caused the error. This method will
   always throw an exception.

  ex - `com.google.cloud.RetryHelper$RetryHelperException`

  returns: `com.google.cloud.storage.StorageException`

  throws: com.google.cloud.storage.StorageException - when ex was caused by a StorageException"
  (^com.google.cloud.storage.StorageException [^com.google.cloud.RetryHelper$RetryHelperException ex]
    (StorageException/translateAndThrow ex)))

