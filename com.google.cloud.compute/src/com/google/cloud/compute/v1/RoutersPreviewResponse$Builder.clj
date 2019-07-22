(ns com.google.cloud.compute.v1.RoutersPreviewResponse$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RoutersPreviewResponse$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RoutersPreviewResponse`

  returns: `com.google.cloud.compute.v1.RoutersPreviewResponse$Builder`"
  (^com.google.cloud.compute.v1.RoutersPreviewResponse$Builder [^RoutersPreviewResponse$Builder this ^com.google.cloud.compute.v1.RoutersPreviewResponse other]
    (-> this (.mergeFrom other))))

(defn get-resource
  "Preview of given router.

  returns: `com.google.cloud.compute.v1.Router`"
  (^com.google.cloud.compute.v1.Router [^RoutersPreviewResponse$Builder this]
    (-> this (.getResource))))

(defn set-resource
  "Preview of given router.

  resource - `com.google.cloud.compute.v1.Router`

  returns: `com.google.cloud.compute.v1.RoutersPreviewResponse$Builder`"
  (^com.google.cloud.compute.v1.RoutersPreviewResponse$Builder [^RoutersPreviewResponse$Builder this ^com.google.cloud.compute.v1.Router resource]
    (-> this (.setResource resource))))

(defn build
  "returns: `com.google.cloud.compute.v1.RoutersPreviewResponse`"
  (^com.google.cloud.compute.v1.RoutersPreviewResponse [^RoutersPreviewResponse$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RoutersPreviewResponse$Builder`"
  (^com.google.cloud.compute.v1.RoutersPreviewResponse$Builder [^RoutersPreviewResponse$Builder this]
    (-> this (.clone))))

