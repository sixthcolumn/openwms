OpenWMS::Application.routes.draw do

  resources :maintorders

  resources :proced_measurements

  resources :asset_proceds

  resources :proceds

  resources :service

  resources :work_task_time_schedules

  resources :work_task_names

  resources :work_task_material_items

  resources :work_task_crews

  resources :work_task_assets

  resources :work_tasks

  resources :work_position_points

  resources :work_order_work_tasks

  resources :work_order_schedules

  resources :work_order_organizations

  resources :work_order_names

  resources :work_order_location_object_refs

  resources :work_order_hazards

  resources :work_order_comments

  resources :work_order_attachments

  resources :work_orders

  resources :vendor_role_types

  resources :vendor_roles

  resources :time_schedules

  resources :seqs

  resources :resultcodes

  resources :requests

  resources :proxy_interfaces

  resources :procedure_measurements

  resources :procedures

  resources :phones

  resources :packages_vendor_role_types

  resources :packages

  resources :other_contactinfos

  resources :organization_names

  resources :organizations

  resources :objectrefs

  resources :nametypes

  resources :name_type_authorities

  resources :measurements

  resources :material_item_names

  resources :material_items

  resources :interfaces

  resources :hazards

  resources :eprilogs

  resources :emails

  resources :districts

  resources :crew_names

  resources :crews

  resources :contactperson_phones

  resources :contactperson_other_contactinfos

  resources :contactperson_emails

  resources :contactperson_addresses

  resources :contactpeople

  resources :comments

  resources :attachments

  resources :asset_procedures

  resources :asset_names

  resources :assets

  resources :address_position_points

  resources :address_hazards

  resources :address_districts

  resources :addresses

  # Home Controller
  get "home/index"
  get "home/acceptTerms"
  get "home/hideWorkHelp"
  root :to => "home#splash"

  
  # END openwms
  
  #-----------------------------------------------------------------------
  # The priority is based upon order of creation: first created -> highest priority.
  # See how all your routes lay out with "rake routes".

  # You can have the root of your site routed with "root"
  # root 'welcome#index'

  # Example of regular route:
  #   get 'products/:id' => 'catalog#view'

  # Example of named route that can be invoked with purchase_url(id: product.id)
  #   get 'products/:id/purchase' => 'catalog#purchase', as: :purchase

  # Example resource route (maps HTTP verbs to controller actions automatically):
  #   resources :products

  # Example resource route with options:
  #   resources :products do
  #     member do
  #       get 'short'
  #       post 'toggle'
  #     end
  #
  #     collection do
  #       get 'sold'
  #     end
  #   end

  # Example resource route with sub-resources:
  #   resources :products do
  #     resources :comments, :sales
  #     resource :seller
  #   end

  # Example resource route with more complex sub-resources:
  #   resources :products do
  #     resources :comments
  #     resources :sales do
  #       get 'recent', on: :collection
  #     end
  #   end

  # Example resource route with concerns:
  #   concern :toggleable do
  #     post 'toggle'
  #   end
  #   resources :posts, concerns: :toggleable
  #   resources :photos, concerns: :toggleable

  # Example resource route within a namespace:
  #   namespace :admin do
  #     # Directs /admin/products/* to Admin::ProductsController
  #     # (app/controllers/admin/products_controller.rb)
  #     resources :products
  #   end
end
