(ns com.google.cloud.storage.Storage$CopyRequest
  "A class to contain all information needed for a Google Cloud Storage Copy operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Storage$CopyRequest]))

(defn *of
  "Creates a copy request. target parameter is used to override source blob information
   (e.g. contentType, contentLanguage).

  source-bucket - name of the bucket containing the source blob - `java.lang.String`
  source-blob - name of the source blob - `java.lang.String`
  target - a BlobInfo object for the target blob - `com.google.cloud.storage.BlobInfo`

  returns: a copy request - `com.google.cloud.storage.Storage$CopyRequest`"
  (^com.google.cloud.storage.Storage$CopyRequest [^java.lang.String source-bucket ^java.lang.String source-blob ^com.google.cloud.storage.BlobInfo target]
    (Storage$CopyRequest/of source-bucket source-blob target))
  (^com.google.cloud.storage.Storage$CopyRequest [^com.google.cloud.storage.BlobId source-blob-id ^com.google.cloud.storage.BlobInfo target]
    (Storage$CopyRequest/of source-blob-id target)))

(defn *new-builder
  "Creates a builder for CopyRequest objects.

  returns: `com.google.cloud.storage.Storage$CopyRequest$Builder`"
  (^com.google.cloud.storage.Storage$CopyRequest$Builder []
    (Storage$CopyRequest/newBuilder )))

(defn get-source
  "Returns the blob to copy, as a BlobId.

  returns: `com.google.cloud.storage.BlobId`"
  (^com.google.cloud.storage.BlobId [^Storage$CopyRequest this]
    (-> this (.getSource))))

(defn get-source-options
  "Returns blob's source options.

  returns: `java.util.List<com.google.cloud.storage.Storage$BlobSourceOption>`"
  (^java.util.List [^Storage$CopyRequest this]
    (-> this (.getSourceOptions))))

(defn get-target
  "Returns the BlobInfo for the target blob.

  returns: `com.google.cloud.storage.BlobInfo`"
  (^com.google.cloud.storage.BlobInfo [^Storage$CopyRequest this]
    (-> this (.getTarget))))

(defn override-info
  "Returns whether to override the target blob information with getTarget(). If true, the value of getTarget() is used to replace source blob information (e.g.
   contentType, contentLanguage). Target blob information is set exactly to this
   value, no information is inherited from the source blob. If false, target blob
   information is inherited from the source blob.

  returns: `boolean`"
  (^Boolean [^Storage$CopyRequest this]
    (-> this (.overrideInfo))))

(defn get-target-options
  "Returns blob's target options.

  returns: `java.util.List<com.google.cloud.storage.Storage$BlobTargetOption>`"
  (^java.util.List [^Storage$CopyRequest this]
    (-> this (.getTargetOptions))))

(defn get-megabytes-copied-per-chunk
  "Returns the maximum number of megabytes to copy for each RPC call. This parameter is ignored
   if source and target blob share the same location and storage class as copy is made with one
   single RPC.

  returns: `java.lang.Long`"
  (^java.lang.Long [^Storage$CopyRequest this]
    (-> this (.getMegabytesCopiedPerChunk))))

