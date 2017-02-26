module NametypesHelper

   def get_name_type(nametype)
      nametype.name if nametype
   end

   def get_name_type_authority(nametype)
      if nametype && nametype.name_type_authority
         nametype.name_type_authority.name
      end
   end
end
