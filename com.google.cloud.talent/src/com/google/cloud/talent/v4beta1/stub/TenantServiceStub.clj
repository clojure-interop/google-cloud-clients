(ns com.google.cloud.talent.v4beta1.stub.TenantServiceStub
  "Base stub class for Cloud Talent Solution API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub TenantServiceStub]))

(defn ->tenant-service-stub
  "Constructor."
  (^TenantServiceStub []
    (new TenantServiceStub )))

(defn create-tenant-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CreateTenantRequest,com.google.cloud.talent.v4beta1.Tenant>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TenantServiceStub this]
    (-> this (.createTenantCallable))))

(defn get-tenant-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.GetTenantRequest,com.google.cloud.talent.v4beta1.Tenant>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TenantServiceStub this]
    (-> this (.getTenantCallable))))

(defn update-tenant-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.UpdateTenantRequest,com.google.cloud.talent.v4beta1.Tenant>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TenantServiceStub this]
    (-> this (.updateTenantCallable))))

(defn delete-tenant-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.DeleteTenantRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TenantServiceStub this]
    (-> this (.deleteTenantCallable))))

(defn list-tenants-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListTenantsRequest,com.google.cloud.talent.v4beta1.TenantServiceClient$ListTenantsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TenantServiceStub this]
    (-> this (.listTenantsPagedCallable))))

(defn list-tenants-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListTenantsRequest,com.google.cloud.talent.v4beta1.ListTenantsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TenantServiceStub this]
    (-> this (.listTenantsCallable))))

(defn close
  ""
  ([^TenantServiceStub this]
    (-> this (.close))))

