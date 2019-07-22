(ns com.google.cloud.storage.StorageBatch
  "A batch of operations to be submitted to Google Cloud Storage using a single RPC request.

  Example of using a batch request to delete, update and get a blob:



  StorageBatch batch = storage.batch();
  BlobId firstBlob = BlobId.of(\"bucket\", \"blob1\"));
  BlobId secondBlob = BlobId.of(\"bucket\", \"blob2\"));
  batch.delete(firstBlob).notify(new BatchResult.Callback<Boolean, StorageException>() {
    public void success(Boolean result) {
      // deleted successfully
    }

    public void error(StorageException exception) {
      // delete failed
    }
  });
  batch.update(BlobInfo.builder(secondBlob).contentType(\"text/plain\").build());
  StorageBatchResult<Blob> result = batch.get(secondBlob);
  batch.submit();
  Blob blob = result.get(); // returns get result or throws StorageException"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage StorageBatch]))

(defn delete
  "Adds a request representing the \"delete blob\" operation to this batch. Calling BatchResult.get() on the return value yields true upon successful deletion,
   false if the blob was not found, or throws a StorageException if the operation
   failed.

  bucket - `java.lang.String`
  blob - `java.lang.String`
  options - `com.google.cloud.storage.Storage$BlobSourceOption`

  returns: `com.google.cloud.storage.StorageBatchResult<java.lang.Boolean>`"
  (^com.google.cloud.storage.StorageBatchResult [^StorageBatch this ^java.lang.String bucket ^java.lang.String blob ^com.google.cloud.storage.Storage$BlobSourceOption options]
    (-> this (.delete bucket blob options)))
  (^com.google.cloud.storage.StorageBatchResult [^StorageBatch this ^com.google.cloud.storage.BlobId blob ^com.google.cloud.storage.Storage$BlobSourceOption options]
    (-> this (.delete blob options))))

(defn update
  "Adds a request representing the \"update blob\" operation to this batch. The options can
   be used in the same way as for Storage.update(BlobInfo, BlobTargetOption...). Calling
   BatchResult.get() on the return value yields the updated Blob if
   successful, or throws a StorageException if the operation failed.

  blob-info - `com.google.cloud.storage.BlobInfo`
  options - `com.google.cloud.storage.Storage$BlobTargetOption`

  returns: `com.google.cloud.storage.StorageBatchResult<com.google.cloud.storage.Blob>`"
  (^com.google.cloud.storage.StorageBatchResult [^StorageBatch this ^com.google.cloud.storage.BlobInfo blob-info ^com.google.cloud.storage.Storage$BlobTargetOption options]
    (-> this (.update blob-info options))))

(defn get
  "Adds a request representing the \"get blob\" operation to this batch. The options can be
   used in the same way as for Storage.get(BlobId, BlobGetOption...). Calling BatchResult.get() on the return value yields the requested Blob if successful,
   null if no such blob exists, or throws a StorageException if the operation
   failed.

  bucket - `java.lang.String`
  blob - `java.lang.String`
  options - `com.google.cloud.storage.Storage$BlobGetOption`

  returns: `com.google.cloud.storage.StorageBatchResult<com.google.cloud.storage.Blob>`"
  (^com.google.cloud.storage.StorageBatchResult [^StorageBatch this ^java.lang.String bucket ^java.lang.String blob ^com.google.cloud.storage.Storage$BlobGetOption options]
    (-> this (.get bucket blob options)))
  (^com.google.cloud.storage.StorageBatchResult [^StorageBatch this ^com.google.cloud.storage.BlobId blob ^com.google.cloud.storage.Storage$BlobGetOption options]
    (-> this (.get blob options))))

(defn submit
  "Submits this batch for processing using a single RPC request."
  ([^StorageBatch this]
    (-> this (.submit))))

