(ns com.google.cloud.storage.testing.RemoteStorageHelper$StorageHelperException
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.testing RemoteStorageHelper$StorageHelperException]))

(defn ->storage-helper-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^RemoteStorageHelper$StorageHelperException [^java.lang.String message ^java.lang.Throwable cause]
    (new RemoteStorageHelper$StorageHelperException message cause))
  (^RemoteStorageHelper$StorageHelperException [^java.lang.String message]
    (new RemoteStorageHelper$StorageHelperException message)))

(defn *translate
  "ex - `java.lang.Exception`

  returns: `com.google.cloud.storage.testing.RemoteStorageHelper$StorageHelperException`"
  (^com.google.cloud.storage.testing.RemoteStorageHelper$StorageHelperException [^java.lang.Exception ex]
    (RemoteStorageHelper$StorageHelperException/translate ex)))

