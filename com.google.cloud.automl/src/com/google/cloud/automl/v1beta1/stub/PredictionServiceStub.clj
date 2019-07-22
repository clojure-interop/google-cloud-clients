(ns com.google.cloud.automl.v1beta1.stub.PredictionServiceStub
  "Base stub class for Cloud AutoML API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.automl.v1beta1.stub PredictionServiceStub]))

(defn ->prediction-service-stub
  "Constructor."
  (^PredictionServiceStub []
    (new PredictionServiceStub )))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^PredictionServiceStub this]
    (-> this (.getOperationsStub))))

(defn predict-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.PredictRequest,com.google.cloud.automl.v1beta1.PredictResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^PredictionServiceStub this]
    (-> this (.predictCallable))))

(defn batch-predict-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.BatchPredictRequest,com.google.cloud.automl.v1beta1.BatchPredictResult,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^PredictionServiceStub this]
    (-> this (.batchPredictOperationCallable))))

(defn batch-predict-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.BatchPredictRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^PredictionServiceStub this]
    (-> this (.batchPredictCallable))))

(defn close
  ""
  ([^PredictionServiceStub this]
    (-> this (.close))))

