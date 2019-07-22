(ns com.google.cloud.vision.v1p1beta1.stub.ImageAnnotatorStubSettings$Builder
  "Builder for ImageAnnotatorStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.vision.v1p1beta1.stub ImageAnnotatorStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.vision.v1p1beta1.stub.ImageAnnotatorStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.vision.v1p1beta1.stub.ImageAnnotatorStubSettings$Builder [^ImageAnnotatorStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^ImageAnnotatorStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn batch-annotate-images-settings
  "Returns the builder for the settings used for calls to batchAnnotateImages.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p1beta1.BatchAnnotateImagesRequest,com.google.cloud.vision.v1p1beta1.BatchAnnotateImagesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ImageAnnotatorStubSettings$Builder this]
    (-> this (.batchAnnotateImagesSettings))))

(defn build
  "returns: `com.google.cloud.vision.v1p1beta1.stub.ImageAnnotatorStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.vision.v1p1beta1.stub.ImageAnnotatorStubSettings [^ImageAnnotatorStubSettings$Builder this]
    (-> this (.build))))

