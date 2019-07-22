(ns com.google.cloud.storage.spi.v1.RpcBatch
  "An interface for the collection of batch operations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.spi.v1 RpcBatch]))

(defn add-delete
  "Adds a call to \"delete storage object\" to the batch, with the provided callback and
   options.

  storage-object - `com.google.api.services.storage.model.StorageObject`
  callback - `com.google.cloud.storage.spi.v1.RpcBatch$Callback`
  options - `java.util.Map`"
  ([^RpcBatch this ^com.google.api.services.storage.model.StorageObject storage-object ^com.google.cloud.storage.spi.v1.RpcBatch$Callback callback ^java.util.Map options]
    (-> this (.addDelete storage-object callback options))))

(defn add-patch
  "Adds a call to \"patch storage object\" to the batch, with the provided callback and
   options.

  storage-object - `com.google.api.services.storage.model.StorageObject`
  callback - `com.google.cloud.storage.spi.v1.RpcBatch$Callback`
  options - `java.util.Map`"
  ([^RpcBatch this ^com.google.api.services.storage.model.StorageObject storage-object ^com.google.cloud.storage.spi.v1.RpcBatch$Callback callback ^java.util.Map options]
    (-> this (.addPatch storage-object callback options))))

(defn add-get
  "Adds a call to \"get storage object\" to the batch, with the provided callback and options.

  storage-object - `com.google.api.services.storage.model.StorageObject`
  callback - `com.google.cloud.storage.spi.v1.RpcBatch$Callback`
  options - `java.util.Map`"
  ([^RpcBatch this ^com.google.api.services.storage.model.StorageObject storage-object ^com.google.cloud.storage.spi.v1.RpcBatch$Callback callback ^java.util.Map options]
    (-> this (.addGet storage-object callback options))))

(defn submit
  "Submits a batch of requests for processing using a single RPC request to Cloud Storage."
  ([^RpcBatch this]
    (-> this (.submit))))

