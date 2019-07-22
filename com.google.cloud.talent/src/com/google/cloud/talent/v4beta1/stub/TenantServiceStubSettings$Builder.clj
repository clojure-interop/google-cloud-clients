(ns com.google.cloud.talent.v4beta1.stub.TenantServiceStubSettings$Builder
  "Builder for TenantServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub TenantServiceStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.talent.v4beta1.stub.TenantServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.talent.v4beta1.stub.TenantServiceStubSettings$Builder [^TenantServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^TenantServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn create-tenant-settings
  "Returns the builder for the settings used for calls to createTenant.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.CreateTenantRequest,com.google.cloud.talent.v4beta1.Tenant>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TenantServiceStubSettings$Builder this]
    (-> this (.createTenantSettings))))

(defn get-tenant-settings
  "Returns the builder for the settings used for calls to getTenant.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.GetTenantRequest,com.google.cloud.talent.v4beta1.Tenant>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TenantServiceStubSettings$Builder this]
    (-> this (.getTenantSettings))))

(defn update-tenant-settings
  "Returns the builder for the settings used for calls to updateTenant.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.UpdateTenantRequest,com.google.cloud.talent.v4beta1.Tenant>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TenantServiceStubSettings$Builder this]
    (-> this (.updateTenantSettings))))

(defn delete-tenant-settings
  "Returns the builder for the settings used for calls to deleteTenant.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.DeleteTenantRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TenantServiceStubSettings$Builder this]
    (-> this (.deleteTenantSettings))))

(defn list-tenants-settings
  "Returns the builder for the settings used for calls to listTenants.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.talent.v4beta1.ListTenantsRequest,com.google.cloud.talent.v4beta1.ListTenantsResponse,com.google.cloud.talent.v4beta1.TenantServiceClient$ListTenantsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^TenantServiceStubSettings$Builder this]
    (-> this (.listTenantsSettings))))

(defn build
  "returns: `com.google.cloud.talent.v4beta1.stub.TenantServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.stub.TenantServiceStubSettings [^TenantServiceStubSettings$Builder this]
    (-> this (.build))))

