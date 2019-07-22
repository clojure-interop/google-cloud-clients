(ns com.google.cloud.videointelligence.v1p3beta1.stub.StreamingVideoIntelligenceServiceStub
  "Base stub class for Cloud Video Intelligence API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.videointelligence.v1p3beta1.stub StreamingVideoIntelligenceServiceStub]))

(defn ->streaming-video-intelligence-service-stub
  "Constructor."
  (^StreamingVideoIntelligenceServiceStub []
    (new StreamingVideoIntelligenceServiceStub )))

(defn streaming-annotate-video-callable
  "returns: `com.google.api.gax.rpc.BidiStreamingCallable<com.google.cloud.videointelligence.v1p3beta1.StreamingAnnotateVideoRequest,com.google.cloud.videointelligence.v1p3beta1.StreamingAnnotateVideoResponse>`"
  (^com.google.api.gax.rpc.BidiStreamingCallable [^StreamingVideoIntelligenceServiceStub this]
    (-> this (.streamingAnnotateVideoCallable))))

(defn close
  ""
  ([^StreamingVideoIntelligenceServiceStub this]
    (-> this (.close))))

