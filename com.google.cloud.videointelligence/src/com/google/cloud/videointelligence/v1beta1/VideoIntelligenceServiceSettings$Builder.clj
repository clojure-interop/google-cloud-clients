(ns com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceSettings$Builder
  "Builder for VideoIntelligenceServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.videointelligence.v1beta1 VideoIntelligenceServiceSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.videointelligence.v1beta1.stub.VideoIntelligenceServiceStubSettings$Builder`"
  (^com.google.cloud.videointelligence.v1beta1.stub.VideoIntelligenceServiceStubSettings$Builder [^VideoIntelligenceServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceSettings$Builder [^VideoIntelligenceServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn annotate-video-settings
  "Returns the builder for the settings used for calls to annotateVideo.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.videointelligence.v1beta1.AnnotateVideoRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^VideoIntelligenceServiceSettings$Builder this]
    (-> this (.annotateVideoSettings))))

(defn annotate-video-operation-settings
  "Returns the builder for the settings used for calls to annotateVideo.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.videointelligence.v1beta1.AnnotateVideoRequest,com.google.cloud.videointelligence.v1beta1.AnnotateVideoResponse,com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress>`"
  ([^VideoIntelligenceServiceSettings$Builder this]
    (-> this (.annotateVideoOperationSettings))))

(defn build
  "returns: `com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceSettings [^VideoIntelligenceServiceSettings$Builder this]
    (-> this (.build))))

