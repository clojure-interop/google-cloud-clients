(ns com.google.cloud.talent.v4beta1.stub.EventServiceStub
  "Base stub class for Cloud Talent Solution API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub EventServiceStub]))

(defn ->event-service-stub
  "Constructor."
  (^EventServiceStub []
    (new EventServiceStub )))

(defn create-client-event-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CreateClientEventRequest,com.google.cloud.talent.v4beta1.ClientEvent>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EventServiceStub this]
    (-> this (.createClientEventCallable))))

(defn close
  ""
  ([^EventServiceStub this]
    (-> this (.close))))

