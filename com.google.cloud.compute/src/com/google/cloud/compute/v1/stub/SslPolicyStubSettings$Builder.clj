(ns com.google.cloud.compute.v1.stub.SslPolicyStubSettings$Builder
  "Builder for SslPolicyStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub SslPolicyStubSettings$Builder]))

(defn get-ssl-policy-settings
  "Returns the builder for the settings used for calls to getSslPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetSslPolicyHttpRequest,com.google.cloud.compute.v1.SslPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SslPolicyStubSettings$Builder this]
    (-> this (.getSslPolicySettings))))

(defn delete-ssl-policy-settings
  "Returns the builder for the settings used for calls to deleteSslPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteSslPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SslPolicyStubSettings$Builder this]
    (-> this (.deleteSslPolicySettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.SslPolicyStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.SslPolicyStubSettings$Builder [^SslPolicyStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn insert-ssl-policy-settings
  "Returns the builder for the settings used for calls to insertSslPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertSslPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SslPolicyStubSettings$Builder this]
    (-> this (.insertSslPolicySettings))))

(defn patch-ssl-policy-settings
  "Returns the builder for the settings used for calls to patchSslPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchSslPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SslPolicyStubSettings$Builder this]
    (-> this (.patchSslPolicySettings))))

(defn list-ssl-policies-settings
  "Returns the builder for the settings used for calls to listSslPolicies.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListSslPoliciesHttpRequest,com.google.cloud.compute.v1.SslPoliciesList,com.google.cloud.compute.v1.SslPolicyClient$ListSslPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SslPolicyStubSettings$Builder this]
    (-> this (.listSslPoliciesSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.SslPolicyStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.SslPolicyStubSettings [^SslPolicyStubSettings$Builder this]
    (-> this (.build))))

(defn list-available-features-ssl-policies-settings
  "Returns the builder for the settings used for calls to listAvailableFeaturesSslPolicies.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.ListAvailableFeaturesSslPoliciesHttpRequest,com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SslPolicyStubSettings$Builder this]
    (-> this (.listAvailableFeaturesSslPoliciesSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^SslPolicyStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

