(ns com.google.cloud.errorreporting.v1beta1.stub.ErrorStatsServiceStub
  "Base stub class for Stackdriver Error Reporting API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1.stub ErrorStatsServiceStub]))

(defn ->error-stats-service-stub
  "Constructor."
  (^ErrorStatsServiceStub []
    (new ErrorStatsServiceStub )))

(defn list-group-stats-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest,com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListGroupStatsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ErrorStatsServiceStub this]
    (-> this (.listGroupStatsPagedCallable))))

(defn list-group-stats-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest,com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ErrorStatsServiceStub this]
    (-> this (.listGroupStatsCallable))))

(defn list-events-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest,com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListEventsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ErrorStatsServiceStub this]
    (-> this (.listEventsPagedCallable))))

(defn list-events-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest,com.google.devtools.clouderrorreporting.v1beta1.ListEventsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ErrorStatsServiceStub this]
    (-> this (.listEventsCallable))))

(defn delete-events-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest,com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ErrorStatsServiceStub this]
    (-> this (.deleteEventsCallable))))

(defn close
  ""
  ([^ErrorStatsServiceStub this]
    (-> this (.close))))

