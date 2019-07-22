(ns com.google.cloud.videointelligence.v1p3beta1.stub.StreamingVideoIntelligenceServiceStubSettings$Builder
  "Builder for StreamingVideoIntelligenceServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.videointelligence.v1p3beta1.stub StreamingVideoIntelligenceServiceStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.videointelligence.v1p3beta1.stub.StreamingVideoIntelligenceServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.videointelligence.v1p3beta1.stub.StreamingVideoIntelligenceServiceStubSettings$Builder [^StreamingVideoIntelligenceServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^StreamingVideoIntelligenceServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn streaming-annotate-video-settings
  "Returns the builder for the settings used for calls to streamingAnnotateVideo.

  returns: `com.google.api.gax.rpc.StreamingCallSettings.Builder<com.google.cloud.videointelligence.v1p3beta1.StreamingAnnotateVideoRequest,com.google.cloud.videointelligence.v1p3beta1.StreamingAnnotateVideoResponse>`"
  (^com.google.api.gax.rpc.StreamingCallSettings.Builder [^StreamingVideoIntelligenceServiceStubSettings$Builder this]
    (-> this (.streamingAnnotateVideoSettings))))

(defn build
  "returns: `com.google.cloud.videointelligence.v1p3beta1.stub.StreamingVideoIntelligenceServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.videointelligence.v1p3beta1.stub.StreamingVideoIntelligenceServiceStubSettings [^StreamingVideoIntelligenceServiceStubSettings$Builder this]
    (-> this (.build))))

