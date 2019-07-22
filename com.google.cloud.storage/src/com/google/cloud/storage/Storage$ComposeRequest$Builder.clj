(ns com.google.cloud.storage.Storage$ComposeRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Storage$ComposeRequest$Builder]))

(defn ->builder
  "Constructor."
  (^Storage$ComposeRequest$Builder []
    (new Storage$ComposeRequest$Builder )))

(defn add-source
  "Add a source with a specific generation to match.

  blob - `java.lang.String`
  generation - `long`

  returns: `com.google.cloud.storage.Storage$ComposeRequest$Builder`"
  (^com.google.cloud.storage.Storage$ComposeRequest$Builder [^Storage$ComposeRequest$Builder this ^java.lang.String blob ^Long generation]
    (-> this (.addSource blob generation)))
  (^com.google.cloud.storage.Storage$ComposeRequest$Builder [^Storage$ComposeRequest$Builder this ^java.lang.Iterable blobs]
    (-> this (.addSource blobs))))

(defn set-target
  "Sets compose operation's target blob.

  target - `com.google.cloud.storage.BlobInfo`

  returns: `com.google.cloud.storage.Storage$ComposeRequest$Builder`"
  (^com.google.cloud.storage.Storage$ComposeRequest$Builder [^Storage$ComposeRequest$Builder this ^com.google.cloud.storage.BlobInfo target]
    (-> this (.setTarget target))))

(defn set-target-options
  "Sets compose operation's target blob options.

  options - `com.google.cloud.storage.Storage$BlobTargetOption`

  returns: `com.google.cloud.storage.Storage$ComposeRequest$Builder`"
  (^com.google.cloud.storage.Storage$ComposeRequest$Builder [^Storage$ComposeRequest$Builder this ^com.google.cloud.storage.Storage$BlobTargetOption options]
    (-> this (.setTargetOptions options))))

(defn build
  "Creates a ComposeRequest object.

  returns: `com.google.cloud.storage.Storage$ComposeRequest`"
  (^com.google.cloud.storage.Storage$ComposeRequest [^Storage$ComposeRequest$Builder this]
    (-> this (.build))))

