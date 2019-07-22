(ns com.google.cloud.webrisk.v1beta1.stub.WebRiskServiceV1Beta1StubSettings$Builder
  "Builder for WebRiskServiceV1Beta1StubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.webrisk.v1beta1.stub WebRiskServiceV1Beta1StubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.webrisk.v1beta1.stub.WebRiskServiceV1Beta1StubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.webrisk.v1beta1.stub.WebRiskServiceV1Beta1StubSettings$Builder [^WebRiskServiceV1Beta1StubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^WebRiskServiceV1Beta1StubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn compute-threat-list-diff-settings
  "Returns the builder for the settings used for calls to computeThreatListDiff.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.webrisk.v1beta1.ComputeThreatListDiffRequest,com.google.webrisk.v1beta1.ComputeThreatListDiffResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebRiskServiceV1Beta1StubSettings$Builder this]
    (-> this (.computeThreatListDiffSettings))))

(defn search-uris-settings
  "Returns the builder for the settings used for calls to searchUris.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.webrisk.v1beta1.SearchUrisRequest,com.google.webrisk.v1beta1.SearchUrisResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebRiskServiceV1Beta1StubSettings$Builder this]
    (-> this (.searchUrisSettings))))

(defn search-hashes-settings
  "Returns the builder for the settings used for calls to searchHashes.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.webrisk.v1beta1.SearchHashesRequest,com.google.webrisk.v1beta1.SearchHashesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WebRiskServiceV1Beta1StubSettings$Builder this]
    (-> this (.searchHashesSettings))))

(defn build
  "returns: `com.google.cloud.webrisk.v1beta1.stub.WebRiskServiceV1Beta1StubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.webrisk.v1beta1.stub.WebRiskServiceV1Beta1StubSettings [^WebRiskServiceV1Beta1StubSettings$Builder this]
    (-> this (.build))))

