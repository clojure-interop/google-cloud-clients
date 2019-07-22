(ns com.google.cloud.vision.v1p2beta1.ImageAnnotatorSettings$Builder
  "Builder for ImageAnnotatorSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.vision.v1p2beta1 ImageAnnotatorSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.vision.v1p2beta1.stub.ImageAnnotatorStubSettings$Builder`"
  (^com.google.cloud.vision.v1p2beta1.stub.ImageAnnotatorStubSettings$Builder [^ImageAnnotatorSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.vision.v1p2beta1.ImageAnnotatorSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.vision.v1p2beta1.ImageAnnotatorSettings$Builder [^ImageAnnotatorSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn batch-annotate-images-settings
  "Returns the builder for the settings used for calls to batchAnnotateImages.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p2beta1.BatchAnnotateImagesRequest,com.google.cloud.vision.v1p2beta1.BatchAnnotateImagesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ImageAnnotatorSettings$Builder this]
    (-> this (.batchAnnotateImagesSettings))))

(defn async-batch-annotate-files-settings
  "Returns the builder for the settings used for calls to asyncBatchAnnotateFiles.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p2beta1.AsyncBatchAnnotateFilesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ImageAnnotatorSettings$Builder this]
    (-> this (.asyncBatchAnnotateFilesSettings))))

(defn async-batch-annotate-files-operation-settings
  "Returns the builder for the settings used for calls to asyncBatchAnnotateFiles.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.vision.v1p2beta1.AsyncBatchAnnotateFilesRequest,com.google.cloud.vision.v1p2beta1.AsyncBatchAnnotateFilesResponse,com.google.cloud.vision.v1p2beta1.OperationMetadata>`"
  ([^ImageAnnotatorSettings$Builder this]
    (-> this (.asyncBatchAnnotateFilesOperationSettings))))

(defn build
  "returns: `com.google.cloud.vision.v1p2beta1.ImageAnnotatorSettings`

  throws: java.io.IOException"
  (^com.google.cloud.vision.v1p2beta1.ImageAnnotatorSettings [^ImageAnnotatorSettings$Builder this]
    (-> this (.build))))

