(ns com.google.cloud.vision.v1p4beta1.stub.ImageAnnotatorStub
  "Base stub class for Cloud Vision API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.vision.v1p4beta1.stub ImageAnnotatorStub]))

(defn ->image-annotator-stub
  "Constructor."
  (^ImageAnnotatorStub []
    (new ImageAnnotatorStub )))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^ImageAnnotatorStub this]
    (-> this (.getOperationsStub))))

(defn batch-annotate-images-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p4beta1.BatchAnnotateImagesRequest,com.google.cloud.vision.v1p4beta1.BatchAnnotateImagesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageAnnotatorStub this]
    (-> this (.batchAnnotateImagesCallable))))

(defn batch-annotate-files-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p4beta1.BatchAnnotateFilesRequest,com.google.cloud.vision.v1p4beta1.BatchAnnotateFilesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageAnnotatorStub this]
    (-> this (.batchAnnotateFilesCallable))))

(defn async-batch-annotate-images-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateImagesRequest,com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateImagesResponse,com.google.cloud.vision.v1p4beta1.OperationMetadata>`"
  ([^ImageAnnotatorStub this]
    (-> this (.asyncBatchAnnotateImagesOperationCallable))))

(defn async-batch-annotate-images-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateImagesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageAnnotatorStub this]
    (-> this (.asyncBatchAnnotateImagesCallable))))

(defn async-batch-annotate-files-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesRequest,com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse,com.google.cloud.vision.v1p4beta1.OperationMetadata>`"
  ([^ImageAnnotatorStub this]
    (-> this (.asyncBatchAnnotateFilesOperationCallable))))

(defn async-batch-annotate-files-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageAnnotatorStub this]
    (-> this (.asyncBatchAnnotateFilesCallable))))

(defn close
  ""
  ([^ImageAnnotatorStub this]
    (-> this (.close))))

