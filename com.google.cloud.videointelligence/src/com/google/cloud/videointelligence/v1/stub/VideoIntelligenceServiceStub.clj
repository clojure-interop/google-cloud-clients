(ns com.google.cloud.videointelligence.v1.stub.VideoIntelligenceServiceStub
  "Base stub class for Cloud Video Intelligence API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.videointelligence.v1.stub VideoIntelligenceServiceStub]))

(defn ->video-intelligence-service-stub
  "Constructor."
  (^VideoIntelligenceServiceStub []
    (new VideoIntelligenceServiceStub )))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^VideoIntelligenceServiceStub this]
    (-> this (.getOperationsStub))))

(defn annotate-video-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.videointelligence.v1.AnnotateVideoRequest,com.google.cloud.videointelligence.v1.AnnotateVideoResponse,com.google.cloud.videointelligence.v1.AnnotateVideoProgress>`"
  ([^VideoIntelligenceServiceStub this]
    (-> this (.annotateVideoOperationCallable))))

(defn annotate-video-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.videointelligence.v1.AnnotateVideoRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^VideoIntelligenceServiceStub this]
    (-> this (.annotateVideoCallable))))

(defn close
  ""
  ([^VideoIntelligenceServiceStub this]
    (-> this (.close))))

