(ns com.google.cloud.storage.CopyWriter
  "Google Storage blob copy writer. A CopyWriter object allows to copy both blob's data and
  information. To override source blob's information supply a BlobInfo to the CopyRequest using either Storage.CopyRequest.Builder.setTarget(BlobInfo,
  Storage.BlobTargetOption...) or Storage.CopyRequest.Builder.setTarget(BlobInfo,
  Iterable).

  This class holds the result of a copy request. If source and destination blobs share the same
  location and storage class the copy is completed in one RPC call otherwise one or more copyChunk() calls are necessary to complete the copy. In addition, getResult()
  can be used to automatically complete the copy and return information on the newly created blob."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage CopyWriter]))

(defn get-result
  "Returns the updated information for the written blob. Calling this method when isDone()
   is false will block until all pending chunks are copied.

   This method has the same effect of doing:



   while (!copyWriter.isDone()) {
      copyWriter.copyChunk();
   }

  returns: `com.google.cloud.storage.Blob`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Blob [^CopyWriter this]
    (-> this (.getResult))))

(defn get-blob-size
  "Returns the size of the blob being copied.

  returns: `long`"
  (^Long [^CopyWriter this]
    (-> this (.getBlobSize))))

(defn done?
  "Returns true if blob copy has finished, false otherwise.

  returns: `boolean`"
  (^Boolean [^CopyWriter this]
    (-> this (.isDone))))

(defn get-total-bytes-copied
  "Returns the number of bytes copied.

  returns: `long`"
  (^Long [^CopyWriter this]
    (-> this (.getTotalBytesCopied))))

(defn copy-chunk
  "Copies the next chunk of the blob. An RPC is issued only if copy has not finished yet (isDone() returns false).

  throws: com.google.cloud.storage.StorageException - upon failure"
  ([^CopyWriter this]
    (-> this (.copyChunk))))

(defn capture
  "Description copied from interface: Restorable

  returns: a RestorableState instance that contains the state for this object and can
       restore it afterwards. - `com.google.cloud.RestorableState<com.google.cloud.storage.CopyWriter>`"
  (^com.google.cloud.RestorableState [^CopyWriter this]
    (-> this (.capture))))

