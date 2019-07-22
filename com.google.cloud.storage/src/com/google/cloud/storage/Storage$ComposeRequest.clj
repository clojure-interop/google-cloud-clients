(ns com.google.cloud.storage.Storage$ComposeRequest
  "A class to contain all information needed for a Google Cloud Storage Compose operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Storage$ComposeRequest]))

(defn *of
  "Creates a ComposeRequest object.

  bucket - name of the bucket where the compose operation takes place - `java.lang.String`
  sources - source blobs names - `java.lang.Iterable`
  target - target blob name - `java.lang.String`

  returns: `com.google.cloud.storage.Storage$ComposeRequest`"
  (^com.google.cloud.storage.Storage$ComposeRequest [^java.lang.String bucket ^java.lang.Iterable sources ^java.lang.String target]
    (Storage$ComposeRequest/of bucket sources target))
  (^com.google.cloud.storage.Storage$ComposeRequest [^java.lang.Iterable sources ^com.google.cloud.storage.BlobInfo target]
    (Storage$ComposeRequest/of sources target)))

(defn *new-builder
  "Returns a ComposeRequest builder.

  returns: `com.google.cloud.storage.Storage$ComposeRequest$Builder`"
  (^com.google.cloud.storage.Storage$ComposeRequest$Builder []
    (Storage$ComposeRequest/newBuilder )))

(defn get-source-blobs
  "Returns compose operation's source blobs.

  returns: `java.util.List<com.google.cloud.storage.Storage$ComposeRequest$SourceBlob>`"
  (^java.util.List [^Storage$ComposeRequest this]
    (-> this (.getSourceBlobs))))

(defn get-target
  "Returns compose operation's target blob.

  returns: `com.google.cloud.storage.BlobInfo`"
  (^com.google.cloud.storage.BlobInfo [^Storage$ComposeRequest this]
    (-> this (.getTarget))))

(defn get-target-options
  "Returns compose operation's target blob's options.

  returns: `java.util.List<com.google.cloud.storage.Storage$BlobTargetOption>`"
  (^java.util.List [^Storage$ComposeRequest this]
    (-> this (.getTargetOptions))))

