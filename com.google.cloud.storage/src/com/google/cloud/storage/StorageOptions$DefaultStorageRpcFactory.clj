(ns com.google.cloud.storage.StorageOptions$DefaultStorageRpcFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage StorageOptions$DefaultStorageRpcFactory]))

(defn ->default-storage-rpc-factory
  "Constructor."
  (^StorageOptions$DefaultStorageRpcFactory []
    (new StorageOptions$DefaultStorageRpcFactory )))

(defn create
  "options - `com.google.cloud.storage.StorageOptions`

  returns: `com.google.cloud.ServiceRpc`"
  (^com.google.cloud.ServiceRpc [^StorageOptions$DefaultStorageRpcFactory this ^com.google.cloud.storage.StorageOptions options]
    (-> this (.create options))))

