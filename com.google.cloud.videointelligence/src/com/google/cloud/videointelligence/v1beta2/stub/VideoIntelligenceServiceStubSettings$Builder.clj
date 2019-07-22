(ns com.google.cloud.videointelligence.v1beta2.stub.VideoIntelligenceServiceStubSettings$Builder
  "Builder for VideoIntelligenceServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.videointelligence.v1beta2.stub VideoIntelligenceServiceStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.videointelligence.v1beta2.stub.VideoIntelligenceServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.videointelligence.v1beta2.stub.VideoIntelligenceServiceStubSettings$Builder [^VideoIntelligenceServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^VideoIntelligenceServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn annotate-video-settings
  "Returns the builder for the settings used for calls to annotateVideo.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.videointelligence.v1beta2.AnnotateVideoRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^VideoIntelligenceServiceStubSettings$Builder this]
    (-> this (.annotateVideoSettings))))

(defn annotate-video-operation-settings
  "Returns the builder for the settings used for calls to annotateVideo.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.videointelligence.v1beta2.AnnotateVideoRequest,com.google.cloud.videointelligence.v1beta2.AnnotateVideoResponse,com.google.cloud.videointelligence.v1beta2.AnnotateVideoProgress>`"
  ([^VideoIntelligenceServiceStubSettings$Builder this]
    (-> this (.annotateVideoOperationSettings))))

(defn build
  "returns: `com.google.cloud.videointelligence.v1beta2.stub.VideoIntelligenceServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.videointelligence.v1beta2.stub.VideoIntelligenceServiceStubSettings [^VideoIntelligenceServiceStubSettings$Builder this]
    (-> this (.build))))

