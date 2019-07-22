(ns com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStub
  "Base stub class for Stackdriver Error Reporting API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1.stub ErrorGroupServiceStub]))

(defn ->error-group-service-stub
  "Constructor."
  (^ErrorGroupServiceStub []
    (new ErrorGroupServiceStub )))

(defn get-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest,com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ErrorGroupServiceStub this]
    (-> this (.getGroupCallable))))

(defn update-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest,com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ErrorGroupServiceStub this]
    (-> this (.updateGroupCallable))))

(defn close
  ""
  ([^ErrorGroupServiceStub this]
    (-> this (.close))))

