(ns com.google.cloud.storage.Storage$CopyRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Storage$CopyRequest$Builder]))

(defn ->builder
  "Constructor."
  (^Storage$CopyRequest$Builder []
    (new Storage$CopyRequest$Builder )))

(defn set-source
  "Sets the blob to copy given bucket and blob name.

  bucket - `java.lang.String`
  blob - `java.lang.String`

  returns: the builder - `com.google.cloud.storage.Storage$CopyRequest$Builder`"
  (^com.google.cloud.storage.Storage$CopyRequest$Builder [^Storage$CopyRequest$Builder this ^java.lang.String bucket ^java.lang.String blob]
    (-> this (.setSource bucket blob)))
  (^com.google.cloud.storage.Storage$CopyRequest$Builder [^Storage$CopyRequest$Builder this ^com.google.cloud.storage.BlobId source]
    (-> this (.setSource source))))

(defn set-source-options
  "Sets blob's source options.

  options - `com.google.cloud.storage.Storage$BlobSourceOption`

  returns: the builder - `com.google.cloud.storage.Storage$CopyRequest$Builder`"
  (^com.google.cloud.storage.Storage$CopyRequest$Builder [^Storage$CopyRequest$Builder this ^com.google.cloud.storage.Storage$BlobSourceOption options]
    (-> this (.setSourceOptions options))))

(defn set-target
  "Sets the copy target. Target blob information is copied from source, except for those
   options specified in options.

  target-id - `com.google.cloud.storage.BlobId`
  options - `com.google.cloud.storage.Storage$BlobTargetOption`

  returns: the builder - `com.google.cloud.storage.Storage$CopyRequest$Builder`"
  (^com.google.cloud.storage.Storage$CopyRequest$Builder [^Storage$CopyRequest$Builder this ^com.google.cloud.storage.BlobId target-id ^com.google.cloud.storage.Storage$BlobTargetOption options]
    (-> this (.setTarget target-id options)))
  (^com.google.cloud.storage.Storage$CopyRequest$Builder [^Storage$CopyRequest$Builder this ^com.google.cloud.storage.BlobId target-id]
    (-> this (.setTarget target-id))))

(defn set-megabytes-copied-per-chunk
  "Sets the maximum number of megabytes to copy for each RPC call. This parameter is ignored
   if source and target blob share the same location and storage class as copy is made with
   one single RPC.

  megabytes-copied-per-chunk - `java.lang.Long`

  returns: the builder - `com.google.cloud.storage.Storage$CopyRequest$Builder`"
  (^com.google.cloud.storage.Storage$CopyRequest$Builder [^Storage$CopyRequest$Builder this ^java.lang.Long megabytes-copied-per-chunk]
    (-> this (.setMegabytesCopiedPerChunk megabytes-copied-per-chunk))))

(defn build
  "Creates a CopyRequest object.

  returns: `com.google.cloud.storage.Storage$CopyRequest`"
  (^com.google.cloud.storage.Storage$CopyRequest [^Storage$CopyRequest$Builder this]
    (-> this (.build))))

