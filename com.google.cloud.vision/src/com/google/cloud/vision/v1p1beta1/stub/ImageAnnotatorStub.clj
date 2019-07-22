(ns com.google.cloud.vision.v1p1beta1.stub.ImageAnnotatorStub
  "Base stub class for Google Cloud Vision API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.vision.v1p1beta1.stub ImageAnnotatorStub]))

(defn ->image-annotator-stub
  "Constructor."
  (^ImageAnnotatorStub []
    (new ImageAnnotatorStub )))

(defn batch-annotate-images-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p1beta1.BatchAnnotateImagesRequest,com.google.cloud.vision.v1p1beta1.BatchAnnotateImagesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageAnnotatorStub this]
    (-> this (.batchAnnotateImagesCallable))))

(defn close
  ""
  ([^ImageAnnotatorStub this]
    (-> this (.close))))

