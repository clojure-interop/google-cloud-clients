(ns com.google.cloud.storage.Storage$ComposeRequest$SourceBlob
  "Class for Compose source blobs."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Storage$ComposeRequest$SourceBlob]))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^Storage$ComposeRequest$SourceBlob this]
    (-> this (.getName))))

(defn get-generation
  "returns: `java.lang.Long`"
  (^java.lang.Long [^Storage$ComposeRequest$SourceBlob this]
    (-> this (.getGeneration))))

