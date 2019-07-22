(ns com.google.cloud.vision.v1p2beta1.stub.ImageAnnotatorStubSettings$Builder
  "Builder for ImageAnnotatorStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.vision.v1p2beta1.stub ImageAnnotatorStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.vision.v1p2beta1.stub.ImageAnnotatorStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.vision.v1p2beta1.stub.ImageAnnotatorStubSettings$Builder [^ImageAnnotatorStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^ImageAnnotatorStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn batch-annotate-images-settings
  "Returns the builder for the settings used for calls to batchAnnotateImages.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p2beta1.BatchAnnotateImagesRequest,com.google.cloud.vision.v1p2beta1.BatchAnnotateImagesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ImageAnnotatorStubSettings$Builder this]
    (-> this (.batchAnnotateImagesSettings))))

(defn async-batch-annotate-files-settings
  "Returns the builder for the settings used for calls to asyncBatchAnnotateFiles.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p2beta1.AsyncBatchAnnotateFilesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ImageAnnotatorStubSettings$Builder this]
    (-> this (.asyncBatchAnnotateFilesSettings))))

(defn async-batch-annotate-files-operation-settings
  "Returns the builder for the settings used for calls to asyncBatchAnnotateFiles.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.vision.v1p2beta1.AsyncBatchAnnotateFilesRequest,com.google.cloud.vision.v1p2beta1.AsyncBatchAnnotateFilesResponse,com.google.cloud.vision.v1p2beta1.OperationMetadata>`"
  ([^ImageAnnotatorStubSettings$Builder this]
    (-> this (.asyncBatchAnnotateFilesOperationSettings))))

(defn build
  "returns: `com.google.cloud.vision.v1p2beta1.stub.ImageAnnotatorStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.vision.v1p2beta1.stub.ImageAnnotatorStubSettings [^ImageAnnotatorStubSettings$Builder this]
    (-> this (.build))))

