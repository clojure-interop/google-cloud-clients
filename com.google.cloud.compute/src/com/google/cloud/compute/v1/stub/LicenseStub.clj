(ns com.google.cloud.compute.v1.stub.LicenseStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub LicenseStub]))

(defn ->license-stub
  "Constructor."
  (^LicenseStub []
    (new LicenseStub )))

(defn insert-license-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertLicenseHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LicenseStub this]
    (-> this (.insertLicenseCallable))))

(defn set-iam-policy-license-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyLicenseHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LicenseStub this]
    (-> this (.setIamPolicyLicenseCallable))))

(defn get-license-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetLicenseHttpRequest,com.google.cloud.compute.v1.License>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LicenseStub this]
    (-> this (.getLicenseCallable))))

(defn get-iam-policy-license-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyLicenseHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LicenseStub this]
    (-> this (.getIamPolicyLicenseCallable))))

(defn delete-license-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteLicenseHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LicenseStub this]
    (-> this (.deleteLicenseCallable))))

(defn close
  ""
  ([^LicenseStub this]
    (-> this (.close))))

(defn test-iam-permissions-license-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsLicenseHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LicenseStub this]
    (-> this (.testIamPermissionsLicenseCallable))))

(defn list-licenses-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListLicensesHttpRequest,com.google.cloud.compute.v1.LicenseClient$ListLicensesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LicenseStub this]
    (-> this (.listLicensesPagedCallable))))

(defn list-licenses-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListLicensesHttpRequest,com.google.cloud.compute.v1.LicensesListResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LicenseStub this]
    (-> this (.listLicensesCallable))))

