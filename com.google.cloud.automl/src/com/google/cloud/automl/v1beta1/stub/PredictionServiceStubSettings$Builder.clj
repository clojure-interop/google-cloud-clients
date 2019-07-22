(ns com.google.cloud.automl.v1beta1.stub.PredictionServiceStubSettings$Builder
  "Builder for PredictionServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.automl.v1beta1.stub PredictionServiceStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.automl.v1beta1.stub.PredictionServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.automl.v1beta1.stub.PredictionServiceStubSettings$Builder [^PredictionServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^PredictionServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn predict-settings
  "Returns the builder for the settings used for calls to predict.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.PredictRequest,com.google.cloud.automl.v1beta1.PredictResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^PredictionServiceStubSettings$Builder this]
    (-> this (.predictSettings))))

(defn batch-predict-settings
  "Returns the builder for the settings used for calls to batchPredict.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.BatchPredictRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^PredictionServiceStubSettings$Builder this]
    (-> this (.batchPredictSettings))))

(defn batch-predict-operation-settings
  "Returns the builder for the settings used for calls to batchPredict.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.automl.v1beta1.BatchPredictRequest,com.google.cloud.automl.v1beta1.BatchPredictResult,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^PredictionServiceStubSettings$Builder this]
    (-> this (.batchPredictOperationSettings))))

(defn build
  "returns: `com.google.cloud.automl.v1beta1.stub.PredictionServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.automl.v1beta1.stub.PredictionServiceStubSettings [^PredictionServiceStubSettings$Builder this]
    (-> this (.build))))

