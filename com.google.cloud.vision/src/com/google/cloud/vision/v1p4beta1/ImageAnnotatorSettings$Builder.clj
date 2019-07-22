(ns com.google.cloud.vision.v1p4beta1.ImageAnnotatorSettings$Builder
  "Builder for ImageAnnotatorSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.vision.v1p4beta1 ImageAnnotatorSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.vision.v1p4beta1.ImageAnnotatorSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.vision.v1p4beta1.ImageAnnotatorSettings$Builder [^ImageAnnotatorSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn async-batch-annotate-files-settings
  "Returns the builder for the settings used for calls to asyncBatchAnnotateFiles.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ImageAnnotatorSettings$Builder this]
    (-> this (.asyncBatchAnnotateFilesSettings))))

(defn build
  "returns: `com.google.cloud.vision.v1p4beta1.ImageAnnotatorSettings`

  throws: java.io.IOException"
  (^com.google.cloud.vision.v1p4beta1.ImageAnnotatorSettings [^ImageAnnotatorSettings$Builder this]
    (-> this (.build))))

(defn async-batch-annotate-images-settings
  "Returns the builder for the settings used for calls to asyncBatchAnnotateImages.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateImagesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ImageAnnotatorSettings$Builder this]
    (-> this (.asyncBatchAnnotateImagesSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.vision.v1p4beta1.stub.ImageAnnotatorStubSettings$Builder`"
  (^com.google.cloud.vision.v1p4beta1.stub.ImageAnnotatorStubSettings$Builder [^ImageAnnotatorSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn batch-annotate-images-settings
  "Returns the builder for the settings used for calls to batchAnnotateImages.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p4beta1.BatchAnnotateImagesRequest,com.google.cloud.vision.v1p4beta1.BatchAnnotateImagesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ImageAnnotatorSettings$Builder this]
    (-> this (.batchAnnotateImagesSettings))))

(defn async-batch-annotate-files-operation-settings
  "Returns the builder for the settings used for calls to asyncBatchAnnotateFiles.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesRequest,com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse,com.google.cloud.vision.v1p4beta1.OperationMetadata>`"
  ([^ImageAnnotatorSettings$Builder this]
    (-> this (.asyncBatchAnnotateFilesOperationSettings))))

(defn async-batch-annotate-images-operation-settings
  "Returns the builder for the settings used for calls to asyncBatchAnnotateImages.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateImagesRequest,com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateImagesResponse,com.google.cloud.vision.v1p4beta1.OperationMetadata>`"
  ([^ImageAnnotatorSettings$Builder this]
    (-> this (.asyncBatchAnnotateImagesOperationSettings))))

(defn batch-annotate-files-settings
  "Returns the builder for the settings used for calls to batchAnnotateFiles.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p4beta1.BatchAnnotateFilesRequest,com.google.cloud.vision.v1p4beta1.BatchAnnotateFilesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ImageAnnotatorSettings$Builder this]
    (-> this (.batchAnnotateFilesSettings))))

