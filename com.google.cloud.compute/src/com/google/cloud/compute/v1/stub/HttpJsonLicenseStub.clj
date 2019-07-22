(ns com.google.cloud.compute.v1.stub.HttpJsonLicenseStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonLicenseStub]))

(def *-delete-license-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteLicenseHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonLicenseStub/deleteLicenseMethodDescriptor)

(def *-get-license-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetLicenseHttpRequest,com.google.cloud.compute.v1.License>"
  HttpJsonLicenseStub/getLicenseMethodDescriptor)

(def *-get-iam-policy-license-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetIamPolicyLicenseHttpRequest,com.google.cloud.compute.v1.Policy>"
  HttpJsonLicenseStub/getIamPolicyLicenseMethodDescriptor)

(def *-insert-license-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertLicenseHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonLicenseStub/insertLicenseMethodDescriptor)

(def *-list-licenses-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListLicensesHttpRequest,com.google.cloud.compute.v1.LicensesListResponse>"
  HttpJsonLicenseStub/listLicensesMethodDescriptor)

(def *-set-iam-policy-license-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetIamPolicyLicenseHttpRequest,com.google.cloud.compute.v1.Policy>"
  HttpJsonLicenseStub/setIamPolicyLicenseMethodDescriptor)

(def *-test-iam-permissions-license-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.TestIamPermissionsLicenseHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>"
  HttpJsonLicenseStub/testIamPermissionsLicenseMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonLicenseStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonLicenseStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonLicenseStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonLicenseStub [^com.google.cloud.compute.v1.stub.LicenseStubSettings settings]
    (HttpJsonLicenseStub/create settings)))

(defn insert-license-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertLicenseHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonLicenseStub this]
    (-> this (.insertLicenseCallable))))

(defn set-iam-policy-license-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyLicenseHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonLicenseStub this]
    (-> this (.setIamPolicyLicenseCallable))))

(defn get-license-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetLicenseHttpRequest,com.google.cloud.compute.v1.License>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonLicenseStub this]
    (-> this (.getLicenseCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonLicenseStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonLicenseStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonLicenseStub this]
    (-> this (.shutdown))))

(defn get-iam-policy-license-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyLicenseHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonLicenseStub this]
    (-> this (.getIamPolicyLicenseCallable))))

(defn delete-license-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteLicenseHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonLicenseStub this]
    (-> this (.deleteLicenseCallable))))

(defn close
  ""
  ([^HttpJsonLicenseStub this]
    (-> this (.close))))

(defn test-iam-permissions-license-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsLicenseHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonLicenseStub this]
    (-> this (.testIamPermissionsLicenseCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonLicenseStub this]
    (-> this (.isTerminated))))

(defn list-licenses-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListLicensesHttpRequest,com.google.cloud.compute.v1.LicenseClient$ListLicensesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonLicenseStub this]
    (-> this (.listLicensesPagedCallable))))

(defn list-licenses-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListLicensesHttpRequest,com.google.cloud.compute.v1.LicensesListResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonLicenseStub this]
    (-> this (.listLicensesCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonLicenseStub this]
    (-> this (.shutdownNow))))

