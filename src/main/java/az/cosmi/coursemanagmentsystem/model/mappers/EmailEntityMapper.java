package az.cosmi.coursemanagmentsystem.model.mappers;

import az.cosmi.coursemanagmentsystem.entity.Email;
import az.cosmi.coursemanagmentsystem.model.dto.email.EmailSendRequestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EmailEntityMapper {
    EmailEntityMapper INSTANCE = Mappers.getMapper(EmailEntityMapper.class);

    @Mapping(source = "from", target = "_from")
    @Mapping(source = "to", target = "_to")
    @Mapping(source = "subject", target = "subject")
    @Mapping(source = "message", target = "message")
    Email fromEmailSendRequestDTO(EmailSendRequestDTO dto);
}
