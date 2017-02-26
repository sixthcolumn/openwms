module WorkTasksHelper

def get_basic_address_info(address)
       if address
           "#{address.sd_address_1}  #{address.sd_address_2} #{address.td_name}  #{address.td_state_province}  #{address.td_postal_code}"
       else
           ""
       end
   end

end
