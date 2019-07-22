(ns com.google.cloud.compute.v1.FirewallClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (FirewallClient firewallClient = FirewallClient.create()) {
    ProjectGlobalFirewallName firewall = ProjectGlobalFirewallName.of(\"[PROJECT]\", \"[FIREWALL]\");
    Operation response = firewallClient.deleteFirewall(firewall);
  }

  Note: close() needs to be called on the firewallClient object to clean up resources such as
  threads. In the example above, try-with-resources is used, which automatically calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of FirewallSettings to create().
  For example:

  To customize credentials:



  FirewallSettings firewallSettings =
      FirewallSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  FirewallClient firewallClient =
      FirewallClient.create(firewallSettings);

  To customize the endpoint:



  FirewallSettings firewallSettings =
      FirewallSettings.newBuilder().setEndpoint(myEndpoint).build();
  FirewallClient firewallClient =
      FirewallClient.create(firewallSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 FirewallClient]))

(defn *create
  "Constructs an instance of FirewallClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.FirewallSettings`

  returns: `com.google.cloud.compute.v1.FirewallClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.FirewallClient [^com.google.cloud.compute.v1.FirewallSettings settings]
    (FirewallClient/create settings))
  (^com.google.cloud.compute.v1.FirewallClient []
    (FirewallClient/create )))

(defn list-firewalls-callable
  "Retrieves the list of firewall rules available to the specified project.

   Sample code:



   try (FirewallClient firewallClient = FirewallClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListFirewallsHttpRequest request = ListFirewallsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       FirewallList response = firewallClient.listFirewallsCallable().call(request);
       for (Firewall element : response.getItemsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListFirewallsHttpRequest,com.google.cloud.compute.v1.FirewallList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirewallClient this]
    (-> this (.listFirewallsCallable))))

(defn patch-firewall
  "Updates the specified firewall rule with the data included in the request. This method supports
   PATCH semantics and uses the JSON merge patch format and processing rules.

   Sample code:



   try (FirewallClient firewallClient = FirewallClient.create()) {
     ProjectGlobalFirewallName firewall = ProjectGlobalFirewallName.of(\"[PROJECT]\", \"[FIREWALL]\");
     Firewall firewallResource = Firewall.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = firewallClient.patchFirewall(firewall, firewallResource, fieldMask);
   }

  firewall - Name of the firewall rule to patch. - `com.google.cloud.compute.v1.ProjectGlobalFirewallName`
  firewall-resource - Represents a Firewall resource. - `com.google.cloud.compute.v1.Firewall`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^FirewallClient this ^com.google.cloud.compute.v1.ProjectGlobalFirewallName firewall ^com.google.cloud.compute.v1.Firewall firewall-resource ^java.util.List field-mask]
    (-> this (.patchFirewall firewall firewall-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^FirewallClient this ^com.google.cloud.compute.v1.PatchFirewallHttpRequest request]
    (-> this (.patchFirewall request))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.FirewallSettings`"
  (^com.google.cloud.compute.v1.FirewallSettings [^FirewallClient this]
    (-> this (.getSettings))))

(defn insert-firewall-callable
  "Creates a firewall rule in the specified project using the data included in the request.

   Sample code:



   try (FirewallClient firewallClient = FirewallClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     Firewall firewallResource = Firewall.newBuilder().build();
     InsertFirewallHttpRequest request = InsertFirewallHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setFirewallResource(firewallResource)
       .build();
     ApiFuture<Operation> future = firewallClient.insertFirewallCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertFirewallHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirewallClient this]
    (-> this (.insertFirewallCallable))))

(defn list-firewalls
  "Retrieves the list of firewall rules available to the specified project.

   Sample code:



   try (FirewallClient firewallClient = FirewallClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (Firewall element : firewallClient.listFirewalls(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.FirewallClient$ListFirewallsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.FirewallClient$ListFirewallsPagedResponse [^FirewallClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listFirewalls project))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.FirewallStub`"
  ([^FirewallClient this]
    (-> this (.getStub))))

(defn get-firewall
  "Returns the specified firewall.

   Sample code:



   try (FirewallClient firewallClient = FirewallClient.create()) {
     ProjectGlobalFirewallName firewall = ProjectGlobalFirewallName.of(\"[PROJECT]\", \"[FIREWALL]\");
     Firewall response = firewallClient.getFirewall(firewall);
   }

  firewall - Name of the firewall rule to return. - `com.google.cloud.compute.v1.ProjectGlobalFirewallName`

  returns: `com.google.cloud.compute.v1.Firewall`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Firewall [^FirewallClient this ^com.google.cloud.compute.v1.ProjectGlobalFirewallName firewall]
    (-> this (.getFirewall firewall))))

(defn delete-firewall
  "Deletes the specified firewall.

   Sample code:



   try (FirewallClient firewallClient = FirewallClient.create()) {
     ProjectGlobalFirewallName firewall = ProjectGlobalFirewallName.of(\"[PROJECT]\", \"[FIREWALL]\");
     Operation response = firewallClient.deleteFirewall(firewall);
   }

  firewall - Name of the firewall rule to delete. - `com.google.cloud.compute.v1.ProjectGlobalFirewallName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^FirewallClient this ^com.google.cloud.compute.v1.ProjectGlobalFirewallName firewall]
    (-> this (.deleteFirewall firewall))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^FirewallClient this]
    (-> this (.isShutdown))))

(defn get-firewall-callable
  "Returns the specified firewall.

   Sample code:



   try (FirewallClient firewallClient = FirewallClient.create()) {
     String formattedFirewall = ProjectGlobalFirewallName.format(\"[PROJECT]\", \"[FIREWALL]\");
     GetFirewallHttpRequest request = GetFirewallHttpRequest.newBuilder()
       .setFirewall(formattedFirewall)
       .build();
     ApiFuture<Firewall> future = firewallClient.getFirewallCallable().futureCall(request);
     // Do something
     Firewall response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetFirewallHttpRequest,com.google.cloud.compute.v1.Firewall>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirewallClient this]
    (-> this (.getFirewallCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^FirewallClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^FirewallClient this]
    (-> this (.shutdown))))

(defn delete-firewall-callable
  "Deletes the specified firewall.

   Sample code:



   try (FirewallClient firewallClient = FirewallClient.create()) {
     String formattedFirewall = ProjectGlobalFirewallName.format(\"[PROJECT]\", \"[FIREWALL]\");
     DeleteFirewallHttpRequest request = DeleteFirewallHttpRequest.newBuilder()
       .setFirewall(formattedFirewall)
       .build();
     ApiFuture<Operation> future = firewallClient.deleteFirewallCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteFirewallHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirewallClient this]
    (-> this (.deleteFirewallCallable))))

(defn close
  ""
  ([^FirewallClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^FirewallClient this]
    (-> this (.isTerminated))))

(defn update-firewall-callable
  "Updates the specified firewall rule with the data included in the request. The PUT method can
   only update the following fields of firewall rule: allowed, description, sourceRanges,
   sourceTags, targetTags.

   Sample code:



   try (FirewallClient firewallClient = FirewallClient.create()) {
     String formattedFirewall = ProjectGlobalFirewallName.format(\"[PROJECT]\", \"[FIREWALL]\");
     Firewall firewallResource = Firewall.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     UpdateFirewallHttpRequest request = UpdateFirewallHttpRequest.newBuilder()
       .setFirewall(formattedFirewall)
       .setFirewallResource(firewallResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = firewallClient.updateFirewallCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateFirewallHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirewallClient this]
    (-> this (.updateFirewallCallable))))

(defn insert-firewall
  "Creates a firewall rule in the specified project using the data included in the request.

   Sample code:



   try (FirewallClient firewallClient = FirewallClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     Firewall firewallResource = Firewall.newBuilder().build();
     Operation response = firewallClient.insertFirewall(project, firewallResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  firewall-resource - Represents a Firewall resource. - `com.google.cloud.compute.v1.Firewall`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^FirewallClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.Firewall firewall-resource]
    (-> this (.insertFirewall project firewall-resource)))
  (^com.google.cloud.compute.v1.Operation [^FirewallClient this ^com.google.cloud.compute.v1.InsertFirewallHttpRequest request]
    (-> this (.insertFirewall request))))

(defn patch-firewall-callable
  "Updates the specified firewall rule with the data included in the request. This method supports
   PATCH semantics and uses the JSON merge patch format and processing rules.

   Sample code:



   try (FirewallClient firewallClient = FirewallClient.create()) {
     String formattedFirewall = ProjectGlobalFirewallName.format(\"[PROJECT]\", \"[FIREWALL]\");
     Firewall firewallResource = Firewall.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     PatchFirewallHttpRequest request = PatchFirewallHttpRequest.newBuilder()
       .setFirewall(formattedFirewall)
       .setFirewallResource(firewallResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = firewallClient.patchFirewallCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchFirewallHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirewallClient this]
    (-> this (.patchFirewallCallable))))

(defn shutdown-now
  ""
  ([^FirewallClient this]
    (-> this (.shutdownNow))))

(defn update-firewall
  "Updates the specified firewall rule with the data included in the request. The PUT method can
   only update the following fields of firewall rule: allowed, description, sourceRanges,
   sourceTags, targetTags.

   Sample code:



   try (FirewallClient firewallClient = FirewallClient.create()) {
     ProjectGlobalFirewallName firewall = ProjectGlobalFirewallName.of(\"[PROJECT]\", \"[FIREWALL]\");
     Firewall firewallResource = Firewall.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = firewallClient.updateFirewall(firewall, firewallResource, fieldMask);
   }

  firewall - Name of the firewall rule to update. - `com.google.cloud.compute.v1.ProjectGlobalFirewallName`
  firewall-resource - Represents a Firewall resource. - `com.google.cloud.compute.v1.Firewall`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^FirewallClient this ^com.google.cloud.compute.v1.ProjectGlobalFirewallName firewall ^com.google.cloud.compute.v1.Firewall firewall-resource ^java.util.List field-mask]
    (-> this (.updateFirewall firewall firewall-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^FirewallClient this ^com.google.cloud.compute.v1.UpdateFirewallHttpRequest request]
    (-> this (.updateFirewall request))))

(defn list-firewalls-paged-callable
  "Retrieves the list of firewall rules available to the specified project.

   Sample code:



   try (FirewallClient firewallClient = FirewallClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListFirewallsHttpRequest request = ListFirewallsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListFirewallsPagedResponse> future = firewallClient.listFirewallsPagedCallable().futureCall(request);
     // Do something
     for (Firewall element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListFirewallsHttpRequest,com.google.cloud.compute.v1.FirewallClient$ListFirewallsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^FirewallClient this]
    (-> this (.listFirewallsPagedCallable))))

