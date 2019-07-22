(ns com.google.cloud.automl.v1beta1.PredictionServiceSettings$Builder
  "Builder for PredictionServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.automl.v1beta1 PredictionServiceSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.automl.v1beta1.stub.PredictionServiceStubSettings$Builder`"
  (^com.google.cloud.automl.v1beta1.stub.PredictionServiceStubSettings$Builder [^PredictionServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.automl.v1beta1.PredictionServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.automl.v1beta1.PredictionServiceSettings$Builder [^PredictionServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn predict-settings
  "Returns the builder for the settings used for calls to predict.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.PredictRequest,com.google.cloud.automl.v1beta1.PredictResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^PredictionServiceSettings$Builder this]
    (-> this (.predictSettings))))

(defn batch-predict-settings
  "Returns the builder for the settings used for calls to batchPredict.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.BatchPredictRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^PredictionServiceSettings$Builder this]
    (-> this (.batchPredictSettings))))

(defn batch-predict-operation-settings
  "Returns the builder for the settings used for calls to batchPredict.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.automl.v1beta1.BatchPredictRequest,com.google.cloud.automl.v1beta1.BatchPredictResult,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^PredictionServiceSettings$Builder this]
    (-> this (.batchPredictOperationSettings))))

(defn build
  "returns: `com.google.cloud.automl.v1beta1.PredictionServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.automl.v1beta1.PredictionServiceSettings [^PredictionServiceSettings$Builder this]
    (-> this (.build))))

