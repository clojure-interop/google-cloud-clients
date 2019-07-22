(ns com.google.cloud.talent.v4beta1.stub.ApplicationServiceStub
  "Base stub class for Cloud Talent Solution API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub ApplicationServiceStub]))

(defn ->application-service-stub
  "Constructor."
  (^ApplicationServiceStub []
    (new ApplicationServiceStub )))

(defn create-application-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CreateApplicationRequest,com.google.cloud.talent.v4beta1.Application>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ApplicationServiceStub this]
    (-> this (.createApplicationCallable))))

(defn get-application-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.GetApplicationRequest,com.google.cloud.talent.v4beta1.Application>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ApplicationServiceStub this]
    (-> this (.getApplicationCallable))))

(defn update-application-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.UpdateApplicationRequest,com.google.cloud.talent.v4beta1.Application>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ApplicationServiceStub this]
    (-> this (.updateApplicationCallable))))

(defn delete-application-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.DeleteApplicationRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ApplicationServiceStub this]
    (-> this (.deleteApplicationCallable))))

(defn list-applications-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListApplicationsRequest,com.google.cloud.talent.v4beta1.ApplicationServiceClient$ListApplicationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ApplicationServiceStub this]
    (-> this (.listApplicationsPagedCallable))))

(defn list-applications-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListApplicationsRequest,com.google.cloud.talent.v4beta1.ListApplicationsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ApplicationServiceStub this]
    (-> this (.listApplicationsCallable))))

(defn close
  ""
  ([^ApplicationServiceStub this]
    (-> this (.close))))

