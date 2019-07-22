(ns com.google.cloud.storage.StorageOptions$DefaultStorageFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage StorageOptions$DefaultStorageFactory]))

(defn ->default-storage-factory
  "Constructor."
  (^StorageOptions$DefaultStorageFactory []
    (new StorageOptions$DefaultStorageFactory )))

(defn create
  "options - `com.google.cloud.storage.StorageOptions`

  returns: `com.google.cloud.storage.Storage`"
  (^com.google.cloud.storage.Storage [^StorageOptions$DefaultStorageFactory this ^com.google.cloud.storage.StorageOptions options]
    (-> this (.create options))))

