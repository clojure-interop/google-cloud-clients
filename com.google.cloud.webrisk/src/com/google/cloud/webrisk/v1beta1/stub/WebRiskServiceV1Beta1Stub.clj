(ns com.google.cloud.webrisk.v1beta1.stub.WebRiskServiceV1Beta1Stub
  "Base stub class for Web Risk API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.webrisk.v1beta1.stub WebRiskServiceV1Beta1Stub]))

(defn ->web-risk-service-v-1-beta-1-stub
  "Constructor."
  (^WebRiskServiceV1Beta1Stub []
    (new WebRiskServiceV1Beta1Stub )))

(defn compute-threat-list-diff-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.webrisk.v1beta1.ComputeThreatListDiffRequest,com.google.webrisk.v1beta1.ComputeThreatListDiffResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebRiskServiceV1Beta1Stub this]
    (-> this (.computeThreatListDiffCallable))))

(defn search-uris-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.webrisk.v1beta1.SearchUrisRequest,com.google.webrisk.v1beta1.SearchUrisResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebRiskServiceV1Beta1Stub this]
    (-> this (.searchUrisCallable))))

(defn search-hashes-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.webrisk.v1beta1.SearchHashesRequest,com.google.webrisk.v1beta1.SearchHashesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebRiskServiceV1Beta1Stub this]
    (-> this (.searchHashesCallable))))

(defn close
  ""
  ([^WebRiskServiceV1Beta1Stub this]
    (-> this (.close))))

